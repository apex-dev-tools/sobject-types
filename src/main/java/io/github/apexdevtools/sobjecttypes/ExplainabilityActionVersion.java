/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
