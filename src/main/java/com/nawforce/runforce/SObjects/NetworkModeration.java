/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class NetworkModeration extends SObject {
	public static SObjectType$<NetworkModeration> SObjectType;
	public static SObjectFields$<NetworkModeration> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id EntityId;
	public SObject Entity;
	public Id Id;
	public String ModerationType;
	public Id NetworkId;
	public Network Network;
	public String Note;
	public String Visibility;

	public NetworkModeration clone$() {throw new java.lang.UnsupportedOperationException();}
	public NetworkModeration clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public NetworkModeration clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public NetworkModeration clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public NetworkModeration clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
