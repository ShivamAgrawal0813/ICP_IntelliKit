// This is a generated file. Not intended for manual editing.
package com.icp.intellij.motoko.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface MotokoStatement extends PsiElement {

  @Nullable
  MotokoExpressionStatement getExpressionStatement();

  @Nullable
  MotokoIfStatement getIfStatement();

  @Nullable
  MotokoLoopStatement getLoopStatement();

  @Nullable
  MotokoReturnStatement getReturnStatement();

}
