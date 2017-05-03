package spring.hk.springcenter.component.impl;

import org.springframework.stereotype.Component;

import spring.hk.springcenter.component.CompactDisc;

/**
 * @author I323691
 *
 */
@Component
public class CompactDiscImpl implements CompactDisc
{

    @Override
    public void play()
    {
        System.out.println("Play...");
    }

}
