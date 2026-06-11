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
public class TopicUserEvent extends SObject {
	public static SObjectType$<TopicUserEvent> SObjectType;
	public static SObjectFields$<TopicUserEvent> Fields;

	public String ActionEnum;
	public Datetime CreatedDate;
	public Id Id;
	public Id NetworkId;
	public Network Network;
	public Id TopicId;
	public Topic Topic;
	public Id UserId;
	public User User;

	public TopicUserEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public TopicUserEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TopicUserEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TopicUserEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TopicUserEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
