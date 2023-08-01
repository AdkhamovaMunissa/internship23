<template>
    <div class="body">
        <div class="head">
            <h1 class="title">Johnson Electric</h1>
            <div>
              <button class="login">
                  <router-link to="/login">Log in</router-link>
              </button>
              <button class="users">
                  <router-link to="/user-list">Users</router-link>
              </button>
              <button class="users">
                  <router-link to="/product-list">Products</router-link>
              </button>
            </div>
        </div>
        <div class="search-container">
            <input type="text" placeholder="Search...">
            <button type="submit">Search</button>
        </div>
        <!-- <div class="table-container">
         <table class="user-table">
           <thead>
             <tr>
               <th>ID</th>
               <th>Name</th>
               <th>Email</th>
             </tr>
           </thead>
           <tbody>
             <tr v-for="user in users" :key="user.id">
               <td>{{ user.id }}</td>
               <td>{{ user.name }}</td>
               <td>{{ user.email }}</td>
             </tr>
           </tbody>
         </table>
      </div>   -->
    </div>
</template>

<script>
// import axios from 'axios';

export default {
    name: 'Home',
    data() {
    return {
      users: []
    }
  },
  mounted() {
  }
}
</script>

<style scoped>
.head {
    width: 100%;
    background-color: orange;
    display: flex;
    justify-content: space-between;
    position: fixed;
    top: 0;
    right: 0;
    height: 50px;
    margin-top: 0px;
}

.body {
    display: flex;
    justify-content: center;
}

.login {
    margin-right: 10px;
    border: none;
    outline: none;
    background-color: transparent;
    color: #fff;
    font-size: 16px;
    padding: 10px 20px;
    border-radius: 20px;
    cursor: pointer;
}

.users {
    margin-right: 10px;
    border: none;
    outline: none;
    background-color: transparent;
    color: #fff;
    font-size: 16px;
    padding: 10px 20px;
    border-radius: 20px;
    cursor: pointer;
}
.title {
    color: white;
    padding: 3px;
    text-align: left;
    margin: 5px;
}
.search-container {
    display: flex;
    align-items: center;
    width: 300px;
    height: 40px;
    border: 1px solid #ccc;
    border-radius: 20px;
    padding: 10px;
    background-color: #fff;
  }
.search-container input[type="text"] {
    flex: 1;
    border: none;
    outline: none;
    font-size: 16px;
  }
.search-container button {
    border: none;
    outline: none;
    background-color: orange;
    color: #fff;
    font-size: 16px;
    padding: 10px 20px;
    border-radius: 20px;
    cursor: pointer;
    align-content: center;
  }
  .table-container {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
}

.user-table {
  width: 80%;
  border-collapse: collapse;
}

.user-table thead th {
  background-color: #f2f2f2;
  font-weight: bold;
  text-align: left;
  padding: 10px;
}

.user-table tbody td {
  border: 1px solid #ddd;
  padding: 10px;
}

  router-link {
    text-decoration: none;
    color: #fff;
  }
</style>
