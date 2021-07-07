<template>
  <div class="home">
    <router-link :to="{ name: 'Home' }"
        class="nav-link"
        active-class="active">
      Home
    </router-link>

  </div>
</template>

<script>
// @ is an alias to /src
export default {
  name: 'Home',
  components: {
  }
}
</script>
