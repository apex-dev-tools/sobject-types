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
public class ProrationPolicy extends SObject {
	public static SObjectType$<ProrationPolicy> SObjectType;
	public static SObjectFields$<ProrationPolicy> Fields;

	public Boolean ArePartialPeriodsAllowed;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public String ProrationPolicyType;
	public String RemainderStrategy;
	public Datetime SystemModstamp;

	public ProductSellingModelOption[] ProductSellingModelOptions;

	public ProrationPolicy clone$() {throw new java.lang.UnsupportedOperationException();}
	public ProrationPolicy clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ProrationPolicy clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ProrationPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ProrationPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
