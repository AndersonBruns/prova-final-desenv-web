<template>
  <div class="home">
    <div class="container">
      <h2>Recuperação WEB - Contas a Pagar - Anderson</h2>
      <br>
      <br>
       <form >
    <div>
    <label>Pessoa</label>
    <select v-model="contapagar.pessoa" class="form-select">
      <option v-for="pessoa in pessoas" v-bind:key="pessoa.id" :value=pessoa>{{pessoa.nome}}</option>
    </select>
  </div>
    <div>
    <label>Tipo de despesa</label>
    <select v-model="contapagar.tipoDespesa" class="form-select">
      <option v-for="tipodespesa in tipodespesas" v-bind:key="tipodespesa.id" :value=tipodespesa>{{tipodespesa.nome}}</option>
    </select>
  </div>
  <div>
    <label>Valor da conta</label>
    <input type="number" step="0.01" min="0" class="form-control" v-model="contapagar.valor">
  </div>
 <div>
      <label>Data de emissão</label><br>
         <input type="date" v-model="contapagar.dataEmissao" required>
    </div>
    <div >
      <label>Data de vencimento</label><br>
         <input type="date" v-model="contapagar.dataVencimento" required>
    </div>
<div>
      <label>Data de pagamento</label><br>
         <input type="date" v-model="contapagar.dataPagamento" required>
    </div>
  <div class="col-12"><br>
    <button @click="salvarConta" class="btn btn-success">Cadastrar conta</button>
  </div>
  <span></span>
</form>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'Home',
  data(){
    return {
      pessoas: [],
      tipodespesas: [],
      contapagar: {
                dataEmissao: '',
                dataVencimento: '',
                dataPagamento: '',
                valor: '',
                pessoa: {
                    id: -1
                },
                tipoDespesa: [],
            },

    }

  },
  mounted(){
    this.pessoa = {
              id: null
            },
    axios.get('http://localhost:8099/pessoa')
            .then(response => {
                this.pessoas = response.data
             })
    axios.get('http://localhost:8099/tipodespesa')
            .then(response => {
                this.tipodespesas = response.data
             })

  },
  methods: {
    salvarConta() {
       axios.post('http://localhost:8099/pagar', 
                    this.contapagar)
                    .then((response) => {
                        if (response != null) {
                            alert("Conta registrada com sucesso")
                            return response
                        }
                    })
                    .catch(error => 
                        alert(error)
                    )
      }

  }
  

}
</script>


<style scoped>
.container {
  align-items: center;
  text-align: center;
  align-self: center;
  padding-left: 200px;
  padding-right: 200px;
}

</style>
