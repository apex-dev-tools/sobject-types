/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EngagementInterface extends SObject {
	public static SObjectType$<EngagementInterface> SObjectType;
	public static SObjectFields$<EngagementInterface> Fields;

	public Datetime EndDateTime;
	public Id Id;
	public String ImplementorType;
	public Datetime StartDateTime;

	public EngagementInterface clone$() {throw new java.lang.UnsupportedOperationException();}
	public EngagementInterface clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EngagementInterface clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EngagementInterface clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EngagementInterface clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
