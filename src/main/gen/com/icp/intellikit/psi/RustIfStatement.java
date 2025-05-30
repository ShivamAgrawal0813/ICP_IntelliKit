// This is a generated file. Not intended for manual editing.
package com.icp.intellikit.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface RustIfStatement extends PsiElement {

  @NotNull
  List<RustBlock> getBlockList();

  @NotNull
  RustExpression getExpression();

  @Nullable
  RustIfStatement getIfStatement();

}
