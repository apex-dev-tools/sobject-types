/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ProcedurePlanOption extends SObject {
	public static SObjectType$<ProcedurePlanOption> SObjectType;
	public static SObjectFields$<ProcedurePlanOption> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CriteriaLogic;
	public Id CtxDefinitionOutputFieldId;
	public DecisionTableParameter CtxDefinitionOutputField;
	public Id CtxMappingOutputFieldId;
	public DecisionTableParameter CtxMappingOutputField;
	public Id DecisionTableId;
	public DecisionTable DecisionTable;
	public String ExpressionSetApiName;
	public Id ExpressionSetDefinitionId;
	public ExpressionSetDefinition ExpressionSetDefinition;
	public String ExpressionSetLabel;
	public Id ExpressionSetOutputFieldId;
	public DecisionTableParameter ExpressionSetOutputField;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String PrimaryObject;
	public Integer Priority;
	public Id ProcedurePlanSectionId;
	public ProcedurePlanSection ProcedurePlanSection;
	public String ReadContextMapping;
	public String SaveContextMapping;
	public Datetime SystemModstamp;

	public ProcedurePlanCriterion[] ProcedurePlanOptionCanonicalMappings;

	public ProcedurePlanOption clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanOption clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanOption clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanOption clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcedurePlanOption clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
