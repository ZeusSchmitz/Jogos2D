function botao(num)
{
    document.getElementById('calc-result').value += num;
}

function limpar()
{
    document.getElementById('calc-result').value = '';
}

function calcula()
{
    var resultado = 0;
    resultado = document.getElementById('calc-result').value;
    document.getElementById('calc-result').value = '';
    if(resultado !== '')
      document.getElementById('calc-result').value = eval(resultado); 
 }

function numEspec(fator)
{
    var resultado = 0;
    resultado = document.getElementById('calc-result').value;
    document.getElementById('calc-result').value = '';
    if(fator === '+-')
    {
        document.getElementById('calc-result').value = resultado * -1;
    }
    else
    {
      if(fator === 'porc')
      {
        document.getElementById('calc-result').value = eval((eval(resultado)/100));
      }
    }
}
