<h1><a id="hh_ioc_0"></a>hh_ioc</h1>
<p>Дз по бенчмаркам</p>
<h3><a id="_2"></a>Запуск</h3>
<pre><code>mvn clean install exec:exec
</code></pre>
<h3><a id="_6"></a>Результаты</h3>
<p><strong>Context start</strong></p>
<table class="table table-striped table-bordered">
<thead>
<tr>
<th>hot</th>
<th>ops/s</th>
<th></th>
<th>cold</th>
<th>ms/op</th>
</tr>
</thead>
<tbody>
<tr>
<td>Spring xml</td>
<td>246</td>
<td></td>
<td>Spring xml</td>
<td>30</td>
</tr>
<tr>
<td>Spring annotation</td>
<td>156</td>
<td></td>
<td>Spring annotation</td>
<td>24</td>
</tr>
<tr>
<td>Spring java</td>
<td>210</td>
<td></td>
<td>Spring java</td>
<td>23</td>
</tr>
<tr>
<td>Guice</td>
<td>1524</td>
<td></td>
<td>Guice</td>
<td>6</td>
</tr>
</tbody>
</table>
<p><strong>Get bean</strong></p>
<table class="table table-striped table-bordered">
<thead>
<tr>
<th>hot</th>
<th>ops/s</th>
<th></th>
<th>cold</th>
<th>ms/op</th>
</tr>
</thead>
<tbody>
<tr>
<td>Spring xml</td>
<td>19 064 578</td>
<td></td>
<td>Spring xml</td>
<td>0.014</td>
</tr>
<tr>
<td>Spring annotation</td>
<td>22 258 413</td>
<td></td>
<td>Spring annotation</td>
<td>0.014</td>
</tr>
<tr>
<td>Spring java</td>
<td>22 440 062</td>
<td></td>
<td>Spring java</td>
<td>0.013</td>
</tr>
<tr>
<td>Guice</td>
<td>14 427 208</td>
<td></td>
<td>Guice</td>
<td>0.020</td>
</tr>
</tbody>
</table>