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
public class ExplainabilityActionVersion extends SObject {
	public static SObjectType$<ExplainabilityActionVersion> SObjectType;
	public static SObjectFields$<ExplainabilityActionVersion> Fields;

	public String ActionLogMessageTemplate;
	public String ActionSpecification;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Integer DefinitionVersion;
	public String Description;
	public String DeveloperName;
	public Id ExplainabilityActionDefId;
	public ExplainabilityActionDef ExplainabilityActionDef;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public Datetime SystemModstamp;

	public ExplainabilityActionVersion clone$() {throw new java.lang.UnsupportedOperationException();}
	public ExplainabilityActionVersion clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ExplainabilityActionVersion clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ExplainabilityActionVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ExplainabilityActionVersion clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
