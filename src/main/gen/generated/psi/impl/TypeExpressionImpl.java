// This is a generated file. Not intended for manual editing.
package generated.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static generated.GeneratedTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import generated.psi.*;

public class TypeExpressionImpl extends ASTWrapperPsiElement implements TypeExpression {

  public TypeExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitTypeExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FunctionType getFunctionType() {
    return findChildByClass(FunctionType.class);
  }

  @Override
  @Nullable
  public ObjectType getObjectType() {
    return findChildByClass(ObjectType.class);
  }

  @Override
  @Nullable
  public PrimitiveType getPrimitiveType() {
    return findChildByClass(PrimitiveType.class);
  }

  @Override
  @Nullable
  public TypeReference getTypeReference() {
    return findChildByClass(TypeReference.class);
  }

}
