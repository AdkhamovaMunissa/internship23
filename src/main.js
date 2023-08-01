import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import 'bootstrap'
import 'bootstrap/dist/css/bootstrap.min.css'

// Vue.config.productionTip = false

// const config = {
//     user: 'azureuser',
//     password: 'api@071423',
//     server: 'sqlserver0714.database.windows.net',
//     database: 'sqlforapi',
//     options: {
//       encrypt: true // Use encryption to secure the connection
//     }
//   }

// // Create a connection pool to reuse connections
// const pool = new sql.ConnectionPool(config)

// // Set up the Vue.js app to use the connection pool as a global variable
// Vue.prototype.$pool = pool

// // Establish a connection to the database
// pool.connect().then(() => {
//   console.log('Connected to Azure SQL database')
// }).catch((err) => {
//   console.log('Error connecting to Azure SQL database:', err)
// })

createApp(App)
    .use(router)
    .mount('#app');   
