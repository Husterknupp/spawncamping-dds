package de.frosner.dds.servables.c3

abstract class IndexedChart(data: Data, title: String)
  extends Chart(data, XAxis.indexed, title)
