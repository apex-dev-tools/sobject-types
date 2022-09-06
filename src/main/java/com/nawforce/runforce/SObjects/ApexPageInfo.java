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
public class ApexPageInfo extends SObject {
	public static SObjectType$<ApexPageInfo> SObjectType;
	public static SObjectFields$<ApexPageInfo> Fields;

	public String ApexPageId;
	public Decimal ApiVersion;
	public String Description;
	public String DurableId;
	public Id Id;
	public Boolean IsAvailableInTouch;
	public String IsShowHeader;
	public String MasterLabel;
	public String Name;
	public String NameSpacePrefix;

	public ApexPageInfo clone$() {throw new java.lang.UnsupportedOperationException();}
	public ApexPageInfo clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ApexPageInfo clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ApexPageInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ApexPageInfo clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
