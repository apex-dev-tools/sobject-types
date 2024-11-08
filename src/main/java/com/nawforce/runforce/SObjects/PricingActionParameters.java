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
public class PricingActionParameters extends SObject {
	public static SObjectType$<PricingActionParameters> SObjectType;
	public static SObjectFields$<PricingActionParameters> Fields;

	public String ContextDefinition;
	public String ContextMapping;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Datetime EffectiveFrom;
	public Datetime EffectiveTo;
	public Id Id;
	public Boolean IsDeleted;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public String NamespacePrefix;
	public String ObjectName;
	public String PricingProcedure;
	public Datetime SystemModstamp;

	public PricingActionParameters clone$() {throw new java.lang.UnsupportedOperationException();}
	public PricingActionParameters clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PricingActionParameters clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PricingActionParameters clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PricingActionParameters clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}