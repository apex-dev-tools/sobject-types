/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ManagedContentChannel extends SObject {
	public static SObjectType$<ManagedContentChannel> SObjectType;
	public static SObjectFields$<ManagedContentChannel> Fields;

	public Long CacheControlMaxAge;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String Domain;
	public String DomainHostName;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Boolean OptionsIsCacheControlPublic;
	public Boolean OptionsIsDomainLocked;
	public Boolean OptionsIsSearchable;
	public Datetime SystemModstamp;
	public String Type;

	public ManagedContentChannel clone$() {throw new java.lang.UnsupportedOperationException();}
	public ManagedContentChannel clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ManagedContentChannel clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ManagedContentChannel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ManagedContentChannel clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
