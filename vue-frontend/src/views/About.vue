
<template>
    <div>
        
    </div>
</template>



<script>
import {onMounted} from 'vue'

export default {
    name : 'APP',
    components : {
        
    },
    setup(){

        const data = {
            boardList : []
        };

        const getList = () => {
            fetch('http://localhost:8081/about')
            .then(response => response.json)
            .then(response => {
                data.boardList = response.data;
            })
            console.log(data)
        };
        onMounted(() => {
            getList();
        })
        return {
            data : data,
            getList : getList
            
        }
    }
}
</script>


<style>

</style>