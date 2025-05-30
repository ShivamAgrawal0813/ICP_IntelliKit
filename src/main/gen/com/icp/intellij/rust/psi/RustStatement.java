// This is a generated file. Not intended for manual editing.
package com.icp.intellij.rust.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustStatement extends PsiElement {

  @Nullable
  RustExpressionStatement getExpressionStatement();

  @Nullable
  RustIfStatement getIfStatement();

  @Nullable
  RustLetStatement getLetStatement();

  @Nullable
  RustLoopStatement getLoopStatement();

  @Nullable
  RustReturnStatement getReturnStatement();

}
