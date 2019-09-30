<template>
  <div id="container">
    <header id="header">
      <div id="header-main" class="header-inner">
        <div class="outer">

          <a href="/" id="logo">
            <i class="logo"></i>
            <span class="site-title">Blog</span>
          </a>

          <nav id="main-nav">
            <a class="main-nav-link" target="_blank" href="/ziyuan-and-fuli">福利资源</a>
            <a class="main-nav-link" target="_blank" href="https://t.xiaomiquan.com/zfEiY3v">知识星球</a>
            <a class="main-nav-link" target="_blank" href="/geek-time">极客时间</a>
            <a class="main-nav-link" target="_blank" href="/freebooks">开源书籍</a>
            <a class="main-nav-link" target="_blank" href="/friendly-links">友链</a>
            <a class="main-nav-link" target="_blank" href="/archives">归档</a>
            <a class="main-nav-link" target="_blank" href="/aboutme">关于</a>
          </nav>

          <nav id="sub-nav">
            <div class="profile" id="profile-nav">
              <a id="profile-anchor" href="javascript:;">
                <img class="avatar" src="/css/images/weixin.jpg"/>
                <i class="fa fa-caret-down"></i>
              </a>
            </div>
          </nav>

          <div id="search-form-wrap">

            <form class="search-form" method="GET" action="https://www.baidu.com/s?">
              <input name="wd" type="text" class="search-form-input" placeholder="搜索"/>
              <button type="submit" class="search-form-submit"></button>
            </form>

          </div>
        </div>
      </div>
      <div id="main-nav-mobile" class="header-sub header-inner">
        <table class="menu outer">
          <tr>

            <td><a class="main-nav-link" href="/ziyuan-and-fuli">福利资源</a></td>

            <td><a class="main-nav-link" href="https://t.xiaomiquan.com/zfEiY3v">知识星球</a></td>

            <td><a class="main-nav-link" href="/geek-time">极客时间</a></td>

            <td><a class="main-nav-link" href="/freebooks">开源书籍</a></td>

            <td><a class="main-nav-link" href="/friendly-links">友链</a></td>

            <td><a class="main-nav-link" href="/archives">归档</a></td>

            <td><a class="main-nav-link" href="/aboutme">关于</a></td>

            <td>

              <form class="search-form" method="GET" action="https://www.baidu.com/s?">
                <input name="wd" type="text" class="search-form-input" placeholder="搜索"/>
                <button type="submit" class="search-form-submit"></button>
              </form>

            </td>
          </tr>
        </table>
      </div>
    </header>
  </div>
</template>

<script>
  export default {
    name: "header"
  }
</script>

<style scoped>

</style>
