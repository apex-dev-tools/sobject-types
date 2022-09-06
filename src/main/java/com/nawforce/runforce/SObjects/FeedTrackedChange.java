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
public class FeedTrackedChange extends SObject {
	public static SObjectType$<FeedTrackedChange> SObjectType;
	public static SObjectFields$<FeedTrackedChange> Fields;

	public String CurrencyIsoCode;
	public Id FeedItemId;
	public SObject FeedItem;
	public String FieldName;
	public Id Id;
	public Object NewValue;
	public String OldCurrencyIsoCode;
	public Object OldValue;

	public FeedTrackedChange clone$() {throw new UnsupportedOperationException();}
	public FeedTrackedChange clone$(Boolean preserveId) {throw new UnsupportedOperationException();}
	public FeedTrackedChange clone$(Boolean preserveId, Boolean isDeepClone) {throw new UnsupportedOperationException();}
	public FeedTrackedChange clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new UnsupportedOperationException();}
	public FeedTrackedChange clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new UnsupportedOperationException();}
}
