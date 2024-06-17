/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ExplainabilityActionDef extends SObject {
	public static SObjectType$<ExplainabilityActionDef> SObjectType;
	public static SObjectFields$<ExplainabilityActionDef> Fields;

	public String ActionLogSchemaType;
	public Id ApplicationSubtypeId;
	public ApplicationSubtypeDefinition ApplicationSubtype;
	public String ApplicationType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Description;
	public String DeveloperName;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsInternal;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Id ProcessTypeId;
	public BusinessProcessTypeDef ProcessType;
	public Datetime SystemModstamp;

	public ExplainabilityActionDef clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExplainabilityActionDef clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExplainabilityActionDef clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExplainabilityActionDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExplainabilityActionDef clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
