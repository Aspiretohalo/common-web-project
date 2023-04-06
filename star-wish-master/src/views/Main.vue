<template>
  <div>
    <router-view></router-view>

    <main-tabbar></main-tabbar>
  </div>
</template>

<script>
import MainTabbar from '@/components/MainTabbar.vue'
export default {
  name: 'StarWishMain',

  data() {
    return {}
  },

  components: {
    MainTabbar,
  },
}
</script>

<style lang="less" scoped>
</style>