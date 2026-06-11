/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class EventBusSubscriber extends SObject {
	public static SObjectType$<EventBusSubscriber> SObjectType;
	public static SObjectFields$<EventBusSubscriber> Fields;

	public String CurrencyIsoCode;
	public String ExternalId;
	public Id Id;
	public Boolean IsPartitioned;
	public String LastError;
	public String LastProcessed;
	public String LastPublished;
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
