package com.financialforce.tools

import java.io.Writer

object CopyrightWriter {

  def write(writer: Writer): Unit = {

    writer.write(
      """/*
        | * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
        | */
        |""".stripMargin
    )
  }
}
