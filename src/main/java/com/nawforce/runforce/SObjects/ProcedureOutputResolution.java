/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

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
