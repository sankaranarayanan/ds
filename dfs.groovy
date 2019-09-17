def graph = [
       v: ['A', 'B', 'C', 'D', 'E', 'F'],
       e: [
            A: ['B'],
            B: ['A', 'C', 'D'],
            C: ['B','D'],
            D: ['B', 'C'],
            E: ['F'],
            F: ['E'],
        ]
]



def dfs(graph) {
   def vertex = graph['v']
   def edges = graph['e']
   def visited = [:]
   for(int i = 0; i < vertex.size(); i++) {
       if(!visited[vertex[i]]) {
           visit(vertex[i], edges, visited)
       }
   }
}

def visit(vertex, edges, visited) {
   visited[vertex] = true
   def edge = edges[vertex]
   print vertex
   for(int i =0; i < edge.size(); i++) {
      if(!visited[edge[i]]) {
          visit(edge[i], edges, visited)     
      }
   }
}

dfs(graph)
