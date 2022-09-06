/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ChatterActivity extends SObject {
	public static SObjectType$<ChatterActivity> SObjectType;
	public static SObjectFields$<ChatterActivity> Fields;

	public Integer CommentCount;
	public Integer CommentReceivedCount;
	public Id Id;
	public Integer InfluenceRawRank;
	public Integer LikeReceivedCount;
	public Id ParentId;
	public User Parent;
	public Integer PostCount;
	public Datetime SystemModstamp;

	public ChatterActivity clone$() {throw new java.lang.UnsupportedOperationException();}
	public ChatterActivity clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ChatterActivity clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ChatterActivity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ChatterActivity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
