<template>
  <div>
    <Header></Header>
    <Main_content_list></Main_content_list>
  </div>
</template>

<script>
  import Header from "./header";
  import Main_content_list from "./main_content_list";
  export default {
    name: 'header',
    components: {Main_content_list, Header},
    data() {
      return {}
    }
  }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }

  ul {
    list-style-type: none;
    padding: 0;
  }

  li {
    display: inline-block;
    margin: 0 10px;
  }

  a {
    color: #42b983;
  }
</style>
