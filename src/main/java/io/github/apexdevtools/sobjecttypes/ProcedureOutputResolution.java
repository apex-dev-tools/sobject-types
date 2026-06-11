/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ProcedureOutputResolution extends SObject {
	public static SObjectType$<ProcedureOutputResolution> SObjectType;
	public static SObjectFields$<ProcedureOutputResolution> Fields;

	public String BusinessVertical;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public String Formula;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDeleted;
	public Boolean IsInternal;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String PricingElement;
	public Datetime SystemModstamp;

	public ProcedureOutputResolution clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProcedureOutputResolution clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProcedureOutputResolution clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProcedureOutputResolution clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProcedureOutputResolution clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
