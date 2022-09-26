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
public class ApexLog extends SObject {
	public static SObjectType$<ApexLog> SObjectType;
	public static SObjectFields$<ApexLog> Fields;

	public String Application;
	public Integer DurationMilliseconds;
	public Id Id;
	public Datetime LastModifiedDate;
	public String Location;
	public Integer LogLength;
	public Id LogUserId;
	public User LogUser;
	public String Operation;
	public String Request;
	public String RequestIdentifier;
	public Datetime StartTime;
	public String Status;
	public Datetime SystemModstamp;

	public ApexLog clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApexLog clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApexLog clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApexLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApexLog clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
