<template>
    <section id="login-section">
            <div id="id-div">
                <input id="usernameInput" type="text" placeholder="아이디" v-model="userInfo.username">
            </div>
            <div id="pw-div">
                <input id="passwordInput" type="password" placeholder="비밀번호" v-model="userInfo.password">
            </div>
            <div id="login-button">
                <button @click="login(userInfo)">로그인</button>
            </div>
    </section>
</template>

<script>
import { reactive } from '@vue/reactivity'
import axios from 'axios'

export default {
    setup() {
        const userInfo = reactive({
            username : '',
            password : ''
        })
        const login = ({dispatch}, userInfo) =>{
            return axios.post('//localhost:8081/login/do', userInfo)
                        .then(res => {
                            let token = res.data.token
                            localStorage.setItem("access_token", token)
                            dispatch("getMemberInfo")
                        })
                        .catch(err => {
                            console.log(err)
                            alert("입력하신 정보를 확인해주세요")
                        })
        }

        const getMemberInfo = ({commit}) => {
            let token = localStorage.getItem("access_token")
            let config = {
                Headers :{
                    "access_token" : token
                }
            }
            axios.get("http://localhost:8081")
        }

        return{
            userInfo,
            login,
            getMemberInfo
        }
    }
}
</script>

<style>
#login-section{
    position: relative;
    top: 20%;
    left: 70%;
    width: 400px;
    height: auto;
    background-color: bisque;
    display: flex;
    flex-direction: column;
}

#id-div{
    display: flex;
    justify-content: center;
}
#id-div input{
    width: 80%;
    height: 40px;
}
#pw-div{
    display: flex;
    justify-content: center;
}
#pw-div input{
    width: 80%;
    height: 40px;
}

#login-button{
    display: flex;
    justify-content: center;
}
#login-button button{
    margin-top: 10px;
    width: 80%;
    height: 35px;
}

</style>