import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        user: {}
      },
      mutations: {
        currentUser (user, userInfo) {
          state.user = userInfo
        }
    
      },
      actions: {
        callMutation ({ state, commit }, { newMsg }) {
          commit('changeMessage', newMsg)
        }
      },
      getters: {
        getMsg (state) {
          return `${state.message} => Length : ${state.message.length}`
        }
      }
  })