<template>
    <div class="head">
        <h1 class="title">Johnson Electric</h1>
    </div>
    <div class="body">
        <h1>Login</h1>
        <form action="/" method="post">
            <!-- <label for="username">Username:</label> -->
            <input type="text" v-model="username" placeholder="Enter username" required><br><br>
            <input type="password" v-model="password" placeholder="Enter password" required><br><br>
            <button type="submit">
                <router-link to="/">Submit</router-link>
            </button>
        </form>
    </div>
    
</template>


<script>

export default {
    name: "Login"
}
</script>

<style scoped>
.head {
    width: 100%;
    background-color: orange;
    position: fixed;
    top: 0;
    right: 0;
    height: 50px;
    margin-top: 0px;
}
input {
    height: 10px;
    padding: 10px;
    border-radius: 4px;
}
.title {
    color: white;
    padding: 3px;
    text-align: left;
    margin: 5px;
}

.body {
    margin-top: 100px;
}
</style>
