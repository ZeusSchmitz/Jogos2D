
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
    var conta = 0;
    conta = document.getElementById('calc-result').value;
    document.getElementById('calc-result').value = '';
    if(conta !== '')
    {
      document.getElementById('calc-result').value = eval(conta);
    }
 }

function numEspec(fator)
{
    var conta = 0;
    conta = document.getElementById('calc-result').value;
    document.getElementById('calc-result').value = '';
    if(fator === '+-')
    {
      document.getElementById('calc-result').value = conta * -1;
    }
    else
    {
      if(fator === 'porc')
      {
        document.getElementById('calc-result').value = eval((eval(conta)/100));
      }
    }
}
