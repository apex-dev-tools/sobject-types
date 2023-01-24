/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.SObject;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class FeedAttachment extends SObject {
	public static SObjectType$<FeedAttachment> SObjectType;
	public static SObjectFields$<FeedAttachment> Fields;

	public Id FeedEntityId;
	public SObject FeedEntity;
	public Id Id;
	public Boolean IsDeleted;
	public Id RecordId;
	public SObject Record;
	public String Title;
	public String Type;
	public String Value;

	public FeedAttachment clone$() {throw new java.lang.UnsupportedOperationException();}
	public FeedAttachment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public FeedAttachment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public FeedAttachment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public FeedAttachment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
