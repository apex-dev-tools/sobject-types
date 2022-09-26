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
public class EventBusSubscriber extends SObject {
	public static SObjectType$<EventBusSubscriber> SObjectType;
	public static SObjectFields$<EventBusSubscriber> Fields;

	public String CurrencyIsoCode;
	public String ExternalId;
	public Id Id;
	public String LastError;
	public String Name;
	public Integer Position;
	public Integer Retries;
	public String Status;
	public Integer Tip;
	public String Topic;
	public String Type;

	public EventBusSubscriber clone$() {throw new java.lang.UnsupportedOperationException();}
	public EventBusSubscriber clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public EventBusSubscriber clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public EventBusSubscriber clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public EventBusSubscriber clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
