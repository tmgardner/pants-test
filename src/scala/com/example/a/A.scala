package com.example.a

import org.jruby.embed.IsolatedScriptingContainer

object A {
  private lazy val jrubyContainer = new IsolatedScriptingContainer()
  def run() = jrubyContainer.runScriptlet("puts \"Hello World!\"");
}
