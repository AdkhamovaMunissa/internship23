import {createRouter, createWebHistory} from "vue-router";
import Login from './components/Login.vue';
import Home from './components/Home.vue';
import UserList from './components/UserList.vue';
import ProductList from './components/ProductLineList.vue'

const routes = [
    {
        name: "Home",
        component: Home,
        path: "/",
    },
    {
        name: "Login",
        component: Login,
        path: "/login",
    },
    {
        name: "User-list",
        component: UserList,
        path: "/user-list",
    },
    {
        name: "Product-list",
        component: ProductList,
        path: "/product-list",
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;

