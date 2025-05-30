// This is a generated file. Not intended for manual editing.
package com.icp.intellikit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustStatement extends PsiElement {

  @Nullable
  RustExpressionStatement getExpressionStatement();

  @Nullable
  RustForStatement getForStatement();

  @Nullable
  RustIfStatement getIfStatement();

  @Nullable
  RustLetStatement getLetStatement();

  @Nullable
  RustLoopStatement getLoopStatement();

  @Nullable
  RustMatchStatement getMatchStatement();

  @Nullable
  RustReturnStatement getReturnStatement();

  @Nullable
  RustWhileStatement getWhileStatement();

}
