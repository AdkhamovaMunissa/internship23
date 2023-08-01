<template>
    <div class="list row">
      <!-- <div class="col-md-8">
        <div class="input-group mb-3">
          <input type="text" class="form-control" placeholder="Search by name"
            v-model="name"/>
          
        </div>
      </div> -->
      <div class="col-4">
        <h4>Product Line List</h4>
        <ul class="list-group">
          <li class="list-group-item"
            :class="{ active: index == currentIndex }"
            v-for="(product, index) in products"
            :key="index"
            @click="setActiveProduct(product, index)"
          >
            {{ product.fullProductLine }}
          </li>
        </ul>
  
      </div>
      <div class="col-8">
        <div v-if="currentProduct">
          <h4>Product Line</h4>
          <div>
            <label><strong>Name: </strong></label> {{ currentProduct.fullProductLine }}
          </div>
          <div>
            <label><strong>Source_db_name: </strong></label> {{ currentProduct.sourceDbName }}
          </div>
          <div>
            <label><strong>Plant code: </strong></label> {{ currentProduct.plantCode }}
          </div>
          <div>
            <label><strong>Location code: </strong></label> {{ currentProduct.locationCode }}
          </div>
          <div>
            <label><strong>Line no: </strong></label> {{ currentProduct.lineNo }}
          </div>
          <div>
            <label><strong>Line Description: </strong></label> {{ currentProduct.lineDesc }}
          </div>
          <div>
            <label><strong>ETL Creation Date: </strong></label> {{ currentProduct.etlCreationDate }}
          </div>
          <div>
            <label><strong>ETL Last Update: </strong></label> {{ currentProduct.etlLastUpdate }}
          </div>
        </div>
        <div v-else>
          <br />
          <p>Please click on a product...</p>
        </div>
      </div>
    </div>
  </template>
  
  <script>
  import ProductDataService from "../services/ProductDataService";
  
  export default {
    name: "Product-list",
    data() {
      return {
        products: [],
        currentProduct: null,
        currentIndex: -1,
        name: ""
      };
    },
    methods: {
      retrieveProducts() {
        ProductDataService.getAll()
          .then(response => {
            this.products = response.data;
            console.log(response.data);
          })
          .catch(e => {
            console.log(e);
          });
      },
  
      refreshList() {
        this.retrieveProducts();
        this.currentProduct = null;
        this.currentIndex = -1;
      },
  
      setActiveProduct(product, index) {
        this.currentProduct = product;
        this.currentIndex = product ? index : -1;
      },
      
    },
    mounted() {
      this.retrieveProducts();
    }
  };
  </script>
  
  <style>
  .list {
    text-align: left;
    max-width: 750px;
    margin: auto;
  }

  .table {
    margin-left: 20px;
    margin-right: 20px;
  }
  </style>