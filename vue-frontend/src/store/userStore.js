import { login, logout, getInfo } from '../api/user'
import { getToken, setToken, removeToken } from '../utils/auth'
// import { resetRouter } from '@/router'

const getDefaultState = () => {
  return {
    token: getToken(),
    name: '',
    avatar: ''
  }
}

const state = getDefaultState()

const mutations = {
  //리셋
  RESET_STATE: (state) => {
    Object.assign(state, getDefaultState())
    //첫 번째 매개변수 state에 2번째 매개변수를 병합시킴
  },
  //토큰 셋팅
  SET_TOKEN: (state, token) => {
    state.token = token
  },
  //이름 세팅
  SET_NAME: (state, name) => {
    state.name = name
  },
  SET_AVATAR: (state, avatar) => {
    state.avatar = avatar
  }
}

const actions = {
  // user login
  login({ commit }, userInfo) {
    const { username, password } = userInfo
    
    return new Promise((resolve, reject) => {
      login({ userId: username.trim(), userPass: password }).then(response => {
        
        
        console.log("user login")
        console.log(response)

        //const { data } = response.data
        console.log("data.token =======>" + response.data.token)
        console.log("data.user =======>" + JSON.stringify(response.data.user))

        commit('SET_TOKEN', response.data.token)
        setToken(response.data.token)

        //commit('SET_TOKEN', data.token)
        //setToken(data.token)
        resolve()
      }).catch(error => {
        reject(error)
      })
    })
  },

  // get user info
  getInfo({ commit, state }) {
    return new Promise((resolve, reject) => {
      getInfo(state.token).then(response => {
        const { data } = response

        if (!data) {
          return reject('Verification failed, please Login again.')
        }

        const { name, avatar } = data

        commit('SET_NAME', name)
        commit('SET_AVATAR', avatar)
        resolve(data)
      }).catch(error => {
        reject(error)
      })
    })
  },

  // user logout
  logout({ commit, state }) {
    return new Promise((resolve, reject) => {
      logout(state.token).then(() => {
        removeToken() // must remove  token  first
        // resetRouter()
        commit('RESET_STATE')
        resolve()
      }).catch(error => {
        reject(error)
      })
    })
  },

  // remove token
  resetToken({ commit }) {
    return new Promise(resolve => {
      removeToken() // must remove  token  first
      commit('RESET_STATE')
      resolve()
    })
  }
}

export default {
  namespaced: true,
  state,
  mutations,
  actions
}

