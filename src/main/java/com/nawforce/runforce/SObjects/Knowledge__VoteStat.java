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
public class Knowledge__VoteStat extends SObject {
	public static SObjectType$<Knowledge__VoteStat> SObjectType;
	public static SObjectFields$<Knowledge__VoteStat> Fields;

	public String Channel;
	public Id Id;
	public Boolean IsDeleted;
	public Decimal NormalizedScore;
	public Id ParentId;
	public Knowledge__ka Parent;

	public Knowledge__VoteStat clone$() {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__VoteStat clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__VoteStat clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__VoteStat clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__VoteStat clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
