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

public class ExpressionImpl extends ASTWrapperPsiElement implements Expression {

  public ExpressionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull Visitor visitor) {
    visitor.visitExpression(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof Visitor) accept((Visitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public ArrayExpression getArrayExpression() {
    return findChildByClass(ArrayExpression.class);
  }

  @Override
  @Nullable
  public BinaryExpression getBinaryExpression() {
    return findChildByClass(BinaryExpression.class);
  }

  @Override
  @Nullable
  public CallExpression getCallExpression() {
    return findChildByClass(CallExpression.class);
  }

  @Override
  @Nullable
  public Literal getLiteral() {
    return findChildByClass(Literal.class);
  }

  @Override
  @Nullable
  public ObjectExpression getObjectExpression() {
    return findChildByClass(ObjectExpression.class);
  }

  @Override
  @Nullable
  public PsiElement getId() {
    return findChildByType(ID);
  }

}
