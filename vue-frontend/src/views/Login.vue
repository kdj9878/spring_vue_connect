<template>
    <section id="login-section">
        <div id="id-div">
            <input type="text" placeholder="아이디">
        </div>
        <div id="pw-div">
            <input type="password" placeholder="비밀번호">
        </div>
        <div id="login-button">
            <button>로그인</button>
        </div>
    </section>
</template>

<script>
export default {
    setup() {
        
    },
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