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
