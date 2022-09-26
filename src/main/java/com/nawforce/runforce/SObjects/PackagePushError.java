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
public class PackagePushError extends SObject {
	public static SObjectType$<PackagePushError> SObjectType;
	public static SObjectFields$<PackagePushError> Fields;

	public String ErrorDetails;
	public String ErrorMessage;
	public String ErrorSeverity;
	public String ErrorTitle;
	public String ErrorType;
	public Id Id;
	public Id PackagePushJobId;
	public PackagePushJob PackagePushJob;
	public Datetime SystemModstamp;

	public PackagePushError clone$() {throw new java.lang.UnsupportedOperationException();}
	public PackagePushError clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PackagePushError clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PackagePushError clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PackagePushError clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
