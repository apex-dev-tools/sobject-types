/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class Knowledge__ViewStat extends SObject {
	public static SObjectType$<Knowledge__ViewStat> SObjectType;
	public static SObjectFields$<Knowledge__ViewStat> Fields;

	public String Channel;
	public Id Id;
	public Boolean IsDeleted;
	public Decimal NormalizedScore;
	public Id ParentId;
	public Knowledge__ka Parent;
	public Integer ViewCount;

	public Knowledge__ViewStat clone$() {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__ViewStat clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__ViewStat clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__ViewStat clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Knowledge__ViewStat clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
