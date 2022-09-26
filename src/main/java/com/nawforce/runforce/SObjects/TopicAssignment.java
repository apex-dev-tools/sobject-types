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
public class TopicAssignment extends SObject {
	public static SObjectType$<TopicAssignment> SObjectType;
	public static SObjectFields$<TopicAssignment> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id EntityId;
	public Name Entity;
	public String EntityKeyPrefix;
	public String EntityType;
	public Id Id;
	public Boolean IsDeleted;
	public Id NetworkId;
	public Network Network;
	public Datetime SystemModstamp;
	public Id TopicId;
	public Topic Topic;

	public TopicAssignment clone$() {throw new java.lang.UnsupportedOperationException();}
	public TopicAssignment clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public TopicAssignment clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public TopicAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public TopicAssignment clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
