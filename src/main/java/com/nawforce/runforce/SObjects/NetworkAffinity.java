/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class NetworkAffinity extends SObject {
	public static SObjectType$<NetworkAffinity> SObjectType;
	public static SObjectFields$<NetworkAffinity> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id NetworkId;
	public Network Network;
	public Id ProfileId;
	public Profile Profile;
	public Datetime SystemModstamp;

	public NetworkAffinity clone$() {throw new UnsupportedOperationException();}
	public NetworkAffinity clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public NetworkAffinity clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public NetworkAffinity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public NetworkAffinity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}