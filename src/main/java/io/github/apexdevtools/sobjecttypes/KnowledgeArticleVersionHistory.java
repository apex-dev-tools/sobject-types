/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class KnowledgeArticleVersionHistory extends SObject {
	public static SObjectType$<KnowledgeArticleVersionHistory> SObjectType;
	public static SObjectFields$<KnowledgeArticleVersionHistory> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DataType;
	public String EventType;
	public String FieldName;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Object NewValue;
	public Object OldValue;
	public Id ParentId;
	public KnowledgeArticle Parent;
	public String ParentSobjectType;
	public Id VersionId;
	public Knowledge__kav Version;
	public Integer VersionNumber;

	public KnowledgeArticleVersionHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleVersionHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleVersionHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleVersionHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public KnowledgeArticleVersionHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
