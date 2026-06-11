/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

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
